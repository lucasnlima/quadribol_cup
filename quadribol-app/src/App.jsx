import React, { useState } from "react";
import { makeStyles } from "@material-ui/core/styles";
import AppBar from "@material-ui/core/AppBar";
import Tabs from "@material-ui/core/Tabs";
import Tab from "@material-ui/core/Tab";
import GamesTable from "./pages/GamesTable/GamesTable";
import Arenas from "./pages/Arenas/Arenas";
import Teams from "./pages/Teams/Teams";
import Placing from "./pages/Placing/Placing";

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
    minHeight: "90vh",
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  title: {
    flexGrow: 1,
  },
}));

const App = () => {
  const classes = useStyles();
  const [currenTab, setCurrentTab] = useState();

  const handleChangeTab = (event, value) => {
    setCurrentTab(value);
  };

  return (
    <div className={classes.root}>
      <AppBar position="static">
        <Tabs
          value={currenTab}
          onChange={handleChangeTab}
          aria-label="simple tabs example"
        >
          <Tab label="Tabela de Jogos" />
          <Tab label="Praças Esportivas" />
          <Tab label="Equipes" />
          <Tab label="Classificação" />
        </Tabs>
      </AppBar>
      {currenTab === 0 && <GamesTable />}
      {currenTab === 1 && <Arenas />}
      {currenTab === 2 && <Teams />}
      {currenTab === 3 && <Placing />}
    </div>
  );
};

export default App;
