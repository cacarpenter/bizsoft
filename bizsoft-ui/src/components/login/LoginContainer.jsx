import React, {Component} from 'react';
import {connect} from 'react-redux';
import LoginForm from "./LoginForm";
import {Redirect} from 'react-router-dom';
import {sessionRequest} from "../../store/actions/creators/session-action-creators";
import {SessionSelectors} from "../../store/selectors";

class LoginContainer extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        if (this.props.isLoggedIn) {
            console.log("I think I should redirect")
    //            return (<Redirect to="/businesses"/>);
        }
        return (
            <LoginForm onFormSubmit={this.props.handleLoginSubmit}/>
        );
    }
}

const mapStateToProps = state => {
    return {
        isLoggedIn: SessionSelectors.sessionIsLoggedInSelector(state)
    }
}

const mapDispatchToProps = dispatch => {
    return {
        handleLoginSubmit: () => {
            console.log("Handle Login Submit")
            dispatch(sessionRequest(
                {username: 'changeme@bobo.com', password: 'mrbobo'}
            ))
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(LoginContainer);