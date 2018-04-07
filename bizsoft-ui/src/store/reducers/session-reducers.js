import { SESSION_ACTION_TYPES } from '../actions/types';

const initialState = {
    session: null,
    isFetching: false,
    errorMessage: null
}

export default function sessionReducer(prevState = initialState, action) {
    switch (action.type) {
        case SESSION_ACTION_TYPES.FETCH_SESSION_REQUEST:
            return {
                ...prevState, isFetching: true
            }
        case SESSION_ACTION_TYPES.FETCH_SESSION_SUCCESS:
            return {
                ...prevState, isFetching: false, session: action.payload
            }
        case SESSION_ACTION_TYPES.FETCH_SESSION_FAILED:
            return {
                ...prevState, isFetching: false, errorMessage: action.payload
            }
        default:
            return prevState;
    }
}