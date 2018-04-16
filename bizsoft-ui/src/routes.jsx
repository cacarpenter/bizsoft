import React, {Component} from 'react';
import {Switch, Route, Redirect} from 'react-router-dom';
import PrivateRoute from './PrivateRoute';
import LoginContainer from './components/login/LoginContainer';
import BusinessContainer from "./components/business/BusinessContainer";

class Routes extends Component {
    render() {
        return (
            <div>
                <Switch>
                    <Route exact path="/" render={() => <Redirect to="/login"/>}/>
                    <Route path="/login" component={LoginContainer}/>
                    <PrivateRoute path="/businesses" component={BusinessContainer}/>
                    <Route render={() => {
                        return(<div>Oops...</div>);
                    }}/>
                </Switch>
            </div>
        );
    }
}

export default Routes;