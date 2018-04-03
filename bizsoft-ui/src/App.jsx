import React, {Component} from 'react';
import {Provider} from 'react-redux';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Link} from "react-router-dom";
//import Business from './components/business/BusinessHome'
import LoginContainer from './components/login/LoginContainer'
import configureStore from './store/configure-store'

const store = configureStore();

class App extends Component {
    render() {
        return (
            <Provider store={store}>
                <Router>
                    <div className="App">
                        <header className="App-header">
                            <img src={logo} className="App-logo" alt="logo"/>
                            <h1 className="App-title">Bizsoft Software</h1>
                        </header>
                        <div>
                            <LoginContainer/>
                        </div>
                    </div>
                </Router>
            </Provider>
        );
    }
}

//            <Business name="Bob's Burgers" biz_logo_url="http://placehold.it/75" biz_url="http://www.google.com"/>

export default App;
