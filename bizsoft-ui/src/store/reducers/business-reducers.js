import {
    BUSINESS_ACTION_TYPES
} from '../actions/types';

const initialState = {
    idNamePairs: [],
    isFetching: false,
    errorMessage: null
}

export default function businessReducer(prevState = initialState, action) {
    switch(action.type) {
        case BUSINESS_ACTION_TYPES.FETCH_BUSINESSES_REQUEST:
            break;
        case BUSINESS_ACTION_TYPES.FETCH_BUSINESSES_SUCCESS:
            break;
        case BUSINESS_ACTION_TYPES.FETCH_BUSINESSES_FAILURE:
            break;
        default:
            return prevState;
    }
}
