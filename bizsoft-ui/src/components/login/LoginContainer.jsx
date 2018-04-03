import React, { Component } from 'react';
import LoginForm from "./LoginForm";

class LoginContainer extends Component {
    constructor(props) {
        super(props);
    }

    handleLoginSubmit() {
        alert("Login Submitted");
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