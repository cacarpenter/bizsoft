import React, {Component} from 'react';
import {Provider} from 'react-redux';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Link} from "react-router-dom";
import PrivateRoute from './PrivateRoute';
import LoginContainer from './components/login/LoginContainer';
import BusinessContainer from './components/business/BusinessContainer';
import configureStore from './store/configure-store';
import Routes from './routes';

const store = configureStore();

// class App extends Component {
//     render() {
//         return (
//             <Provider store={store}>
//                 <Router>
//                     <div className="App">
//                         <header className="App-header">
//                             <img src={logo} className="App-logo" alt="logo"/>
//                             <h1 className="App-title">Bizsoft Software</h1>
//                             <div>
//                                 <Link to="/businesses">Businesses</Link>
//                                 {'  -  '}
//                                 <Link to="/login">Sign In</Link>
//                             </div>
//                         </header>
//                         <div>
//                             <Route path="/login" component={LoginContainer}/>
//                             <PrivateRoute path="/businesses" component={BusinessContainer}/>
//                         </div>
//                     </div>
//                 </Router>
//             </Provider>
//         );
//     }
// }

// class App extends Component {
//     render() {
//         return (
//             <Provider store={store}>
//                 <Router>
//                     <Routes/>
//                 </Router>
//             </Provider>
//         );
//     }
// }

 class App extends Component {
     render() {
        return (<h1>BizSoft</h1>);
     }
 }

export default App;
