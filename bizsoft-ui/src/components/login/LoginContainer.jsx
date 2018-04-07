import React, { Component } from 'react';
import LoginForm from "./LoginForm";
import { SessionApi } from "../../api";

'../../api';

class LoginContainer extends Component {
    constructor(props) {
        super(props);
    }

    handleLoginSubmit() {
        console.log("Login submit");
        SessionApi.login({username: 'changeme@bobo.com', password: 'mrbobo'})
    }

    render() {
        return(
            <LoginForm onFormSubmit={this.handleLoginSubmit}/>
        );
    }

    mapPropsToState = state => {

    }
}

export default LoginContainer;