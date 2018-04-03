import { BUSINESS_ACTION_TYPES } from '../types'

function fetchBusinesses() {
    return {
        type: BUSINESS_ACTION_TYPES.FETCH_BUSINESSES_REQUEST
    }
}

function fetchBusinessesSuccess() {
    return {
        type: BUSINESS_ACTION_TYPES.FETCH_BUSINESSES_SUCCESS
    }
}