import React, { useEffect, useState } from "react";
import { makeStyles } from "@material-ui/core/styles";
import AppBar from "@material-ui/core/AppBar";
import Tabs from "@material-ui/core/Tabs";
import Tab from "@material-ui/core/Tab";
import {
  Avatar,
  Container,
  Divider,
  List,
  ListItem,
  ListItemAvatar,
  ListItemText,
  Typography,
} from "@material-ui/core";
import axios from "axios";

const useStyles = makeStyles((theme) => ({
  root: {
    paddingTop: "30px",
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  title: {
    flexGrow: 1,
  },
  container: {
    display: "grid",
  },
  column1: {
    margin: "20px",
    gridColumn: 1,
  },
  column2: {
    margin: "20px",
    gridColumn: 2,
  },
}));

const Teams = () => {
  const classes = useStyles();
  const [currenTab, setCurrentTab] = useState();
  const [times, setTimes] = useState([]);

  const getTimesList = () => {
    const url = process.env.REACT_APP_BACKEND_URL;
    const rota = "/times";
    axios.defaults.headers.post["Content-Type"] =
      "application/json;charset=utf-8";
    axios.defaults.headers.post["Access-Control-Allow-Origin"] = "*";
    axios
      .get(url + rota)
      .then((res) => {
        const times = res.data;
        setTimes(times);
      })
      .catch((err) => console.error(`Erro: ${err}`));
  };

  useEffect(() => {
    getTimesList();
  }, []);

  const handleChangeTab = (event, value) => {
    setCurrentTab(value);
  };

  return (
    <div className={classes.root}>
      <AppBar position="static" color="white">
        <Tabs
          value={currenTab}
          onChange={handleChangeTab}
          aria-label="simple tabs example"
        >
          {times.map((time) => (
            <Tab label={time.nome} />
          ))}
        </Tabs>
      </AppBar>
      <Container className={classes.container}>
        <div className={classes.column1}>
          <h3>TEAM NAME</h3>
          Informação
        </div>
        <div className={classes.column2}>
          <h3>Elenco</h3>
          <List className={classes.root}>
            <ListItem alignItems="flex-start">
              <ListItemAvatar>
                <Avatar alt="Remy Sharp" src="/static/images/avatar/1.jpg" />
              </ListItemAvatar>
              <ListItemText
                primary="Brunch this weekend?"
                secondary={
                  <React.Fragment>
                    <Typography
                      component="span"
                      variant="body2"
                      className={classes.inline}
                      color="textPrimary"
                    >
                      Ali Connors
                    </Typography>
                    {" — I'll be in your neighborhood doing errands this…"}
                  </React.Fragment>
                }
              />
            </ListItem>
            <Divider variant="inset" component="li" />
            <ListItem alignItems="flex-start">
              <ListItemAvatar>
                <Avatar alt="Travis Howard" src="/static/images/avatar/2.jpg" />
              </ListItemAvatar>
              <ListItemText
                primary="Summer BBQ"
                secondary={
                  <React.Fragment>
                    <Typography
                      component="span"
                      variant="body2"
                      className={classes.inline}
                      color="textPrimary"
                    >
                      to Scott, Alex, Jennifer
                    </Typography>
                    {" — Wish I could come, but I'm out of town this…"}
                  </React.Fragment>
                }
              />
            </ListItem>
            <Divider variant="inset" component="li" />
            <ListItem alignItems="flex-start">
              <ListItemAvatar>
                <Avatar alt="Cindy Baker" src="/static/images/avatar/3.jpg" />
              </ListItemAvatar>
              <ListItemText
                primary="Oui Oui"
                secondary={
                  <React.Fragment>
                    <Typography
                      component="span"
                      variant="body2"
                      className={classes.inline}
                      color="textPrimary"
                    >
                      Sandra Adams
                    </Typography>
                    {" — Do you have Paris recommendations? Have you ever…"}
                  </React.Fragment>
                }
              />
            </ListItem>
          </List>
        </div>
      </Container>
    </div>
  );
};

export default Teams;
