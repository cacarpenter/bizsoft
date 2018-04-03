import businessReducer from './business-reducers';
import sessionReducer from './session-reducers';
import { combineReducers } from 'redux';

export default combineReducers({ businessReducer, sessionReducer });
