import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

const Card = (props) => {
    return (
        <div>
            <img src="http://placehold.it/75"/>
            <div>
                <div>Name here...</div>
                <div>Company Name here</div>
            </div>
        </div>
    );
};

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Bizsoft Software</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
            <Card/>
        </p>
      </div>
    );
  }
}

export default App;
