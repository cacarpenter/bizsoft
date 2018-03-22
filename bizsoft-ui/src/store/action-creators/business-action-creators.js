import {
    FETCH_BUSINESSES_FAILURE,
    FETCH_BUSINESSES_REQUEST,
    FETCH_BUSINESSES_SUCCESS
} from '../action-types'

function fetchBusinesses() {
    return {
        type: FETCH_BUSINESSES_REQUEST
    }
}