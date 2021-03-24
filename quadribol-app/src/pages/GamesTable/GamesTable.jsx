import React, { useEffect, useState } from "react";
import { makeStyles } from "@material-ui/core/styles";
import { Card, Container, Divider, List, ListItem } from "@material-ui/core";
import axios from "axios";

const useStyles = makeStyles((theme) => ({
  root: {
    display: "grid",
  },
  column1: {
    //backgroundColor: "red",
    margin: "20px",
    gridColumn: 1,
    height: "100%",
    textAlign: "center",
  },
  column2: {
    //backgroundColor: "blue",
    margin: "20px",
    gridColumn: 2,
    height: "100%",
    textAlign: "center",
  },
}));

const GamesTable = () => {
  const classes = useStyles();
  const [jogosAtuais, setJogosAtuais] = useState([]);

  const getTimesList = () => {
    const url = process.env.REACT_APP_BACKEND_URL;
    const rota = "/jogos";
    axios.defaults.headers.post["Content-Type"] =
      "application/json;charset=utf-8";
    axios.defaults.headers.post["Access-Control-Allow-Origin"] = "*";
    axios
      .get(url + rota)
      .then((res) => {
        setJogosAtuais(res.data);
      })
      .catch((err) => console.error(`Erro: ${err}`));
  };

  useEffect(() => {
    const interval = setInterval(() => {
      getTimesList();
    }, 1000);

    return () => clearInterval(interval);
  }, []);

  return (
    <Container>
      <div className={classes.root}>
        <div className={classes.column1}>
          <h3> Jogos Do Momento</h3>
          <Card>
            <List aria-label="Jogos do momento">
              {jogosAtuais.map((jogo) => (
                <>
                  <ListItem alignItems="center">{`${jogo.timeA.nome} ${jogo.pontosA} x ${jogo.pontosA} ${jogo.timeB.nome}`}</ListItem>
                  <Divider />
                </>
              ))}
            </List>
          </Card>
        </div>
        <div className={classes.column2}>
          <h3> Jogos Anteriores</h3>
          <Card>
            <List aria-label="Jogos do momento">
              <ListItem alignItems="center">TIME A 0 x 1 TIME B</ListItem>
              <Divider />
              <ListItem alignItems="center">TIME A 0 x 1 TIME B</ListItem>
              <Divider />
              <ListItem alignItems="center">TIME A 0 x 1 TIME B</ListItem>
              <Divider />
              <ListItem alignItems="center">TIME A 0 x 1 TIME B</ListItem>
              <Divider />
              <ListItem alignItems="center">TIME A 0 x 1 TIME B</ListItem>
              <Divider />
            </List>
          </Card>
        </div>
      </div>
    </Container>
  );
};

export default GamesTable;
