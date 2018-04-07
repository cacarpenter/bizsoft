import { SESSION_ACTION_TYPES } from '../types';

export const sessionRequest = (session) => {
    return {
        type: SESSION_ACTION_TYPES.FETCH_SESSION_REQUEST,
        payload: session
    };
}

export const sessionSuccess = (session) => {
    return {
        type: SESSION_ACTION_TYPES.FETCH_SESSION_SUCCESS,
        payload: session
    };
}

export const sessionFailed = (errMsg) => {
    return {
        type: SESSION_ACTION_TYPES.FETCH_SESSION_FAILED,
        payload: errMsg
    };
}

