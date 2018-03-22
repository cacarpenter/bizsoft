import React, {Component} from 'react';
import {Provider} from 'react-redux';
import logo from './logo.svg';
import './App.css';
//import Business from './components/business/BusinessHome'
import LoginForm from './components/login/LoginForm'

class App extends Component {
    render() {
        return (
            <Provider>
                <div className="App">
                    <header className="App-header">
                        <img src={logo} className="App-logo" alt="logo"/>
                        <h1 className="App-title">Bizsoft Software</h1>
                    </header>
                    <p className="App-intro">
                        <LoginForm/>
                    </p>
                </div>
            </Provider>
        );
    }
}

//            <Business name="Bob's Burgers" biz_logo_url="http://placehold.it/75" biz_url="http://www.google.com"/>

export default App;
