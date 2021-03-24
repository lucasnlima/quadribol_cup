import React, { useEffect, useState } from "react";
import {
  Box,
  Card,
  CardContent,
  CardMedia,
  makeStyles,
  Typography,
} from "@material-ui/core";
import image1 from "./images/1.png";
import image2 from "./images/2.png";
import image3 from "./images/3.png";
import image4 from "./images/4.png";
import axios from "axios";

const useStyles = makeStyles({
  root: {
    width: "33%",
    margin: "15px",
    minWidth: "300px",
    flex: "none",
  },
  media: {
    height: "40%",
  },
  gridList: {
    height: "90vh",
    display: "flex",
    flexWrap: "nowrap",
    overflow: "auto",
  },
});

const Arenas = () => {
  const classes = useStyles();
  const [arenas, setArenas] = useState([]);
  const imageList = [image1, image2, image3, image4];

  const getArenas = () => {
    const url = process.env.REACT_APP_BACKEND_URL;
    const rota = "/arenas";
    axios.defaults.headers.post["Content-Type"] =
      "application/json;charset=utf-8";
    axios.defaults.headers.post["Access-Control-Allow-Origin"] = "*";
    axios
      .get(url + rota)
      .then((res) => {
        setArenas(res.data);
      })
      .catch((err) => console.error(`Erro: ${err}`));
  };

  useEffect(() => {
    getArenas();
  }, []);

  return (
    <Box className={classes.gridList}>
      {arenas.map((arena) => (
        <>
          <Card className={classes.root}>
            <CardMedia
              className={classes.media}
              image={imageList[arena.id]}
              title="Contemplative Reptile"
            />
            <CardContent>
              <Typography gutterBottom variant="h5" component="h2">
                {arena.nome}
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                Endereço:{arena.endereco}
                Lotação: {arena.capacidade}
                Acomodações: {arena.acomodacoes}
              </Typography>
            </CardContent>
          </Card>
        </>
      ))}
    </Box>
  );
};

export default Arenas;
