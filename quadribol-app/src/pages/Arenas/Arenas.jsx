import React from "react";
import {
  Box,
  Card,
  CardContent,
  CardMedia,
  makeStyles,
  Typography,
} from "@material-ui/core";

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

  return (
    <Box className={classes.gridList}>
      <Card className={classes.root}>
        <CardMedia
          className={classes.media}
          // image="/static/images/cards/contemplative-reptile.jpg"
          // title="Contemplative Reptile"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            Arena 1
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            Endereços: USHASUHAUSHDA Descrição: JKSDHAKSJHDKAJSHDKASDAS Lotação:
            SDKAJSDA Acomodações: lkdjalsdas Transporte: sdasdlasjlkda
          </Typography>
        </CardContent>
      </Card>
      <Card className={classes.root}>
        <CardMedia
          className={classes.media}
          // image="/static/images/cards/contemplative-reptile.jpg"
          // title="Contemplative Reptile"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            Arena 2
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            Endereços: USHASUHAUSHDA Descrição: JKSDHAKSJHDKAJSHDKASDAS Lotação:
            SDKAJSDA Acomodações: lkdjalsdas Transporte: sdasdlasjlkda
          </Typography>
        </CardContent>
      </Card>
      <Card className={classes.root}>
        <CardMedia
          className={classes.media}
          // image="/static/images/cards/contemplative-reptile.jpg"
          // title="Contemplative Reptile"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            Arena 3
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            Endereços: USHASUHAUSHDA Descrição: JKSDHAKSJHDKAJSHDKASDAS Lotação:
            SDKAJSDA Acomodações: lkdjalsdas Transporte: sdasdlasjlkda
          </Typography>
        </CardContent>
      </Card>
      <Card className={classes.root}>
        <CardMedia
          className={classes.media}
          // image="/static/images/cards/contemplative-reptile.jpg"
          // title="Contemplative Reptile"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            Arena 4
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            Endereços: USHASUHAUSHDA Descrição: JKSDHAKSJHDKAJSHDKASDAS Lotação:
            SDKAJSDA Acomodações: lkdjalsdas Transporte: sdasdlasjlkda
          </Typography>
        </CardContent>
      </Card>
    </Box>
  );
};

export default Arenas;
