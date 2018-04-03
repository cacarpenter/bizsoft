import {
    FETCH_BUSINESSES_FAILURE,
    FETCH_BUSINESSES_REQUEST,
    FETCH_BUSINESSES_SUCCESS
} from '../actions/types';

const initialState = {
    businessNames: [],
}

export default function businessReducer(prevState = initialState, action) {
    switch(action.type) {
        default:
            return prevState;
    }
}
