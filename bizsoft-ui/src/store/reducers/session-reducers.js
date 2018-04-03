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
        default:
            return prevState;
    }
}