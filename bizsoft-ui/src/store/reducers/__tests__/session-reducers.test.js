import SESSION_ACTION_TYPES from '../../actions/types';
import sessionReducer from '../session-reducers';
import {sessionRequest} from '../../actions/creators/session-action-creators'
import deepFreeze from 'deep-freeze';

test("Fetch Session sets isFetching to true and clears other fields", () => {
    const initialState = {
        session: null,
        isFetching: false,
        errorMessage: null
    }
    deepFreeze(initialState);
    const action = sessionRequest({
        email: 'test.example@email.com',
        password: 'secret'
    });
    const expectedState = {
        session: null,
        isFetching: true,
        errorMessage: null
    }
    expect(sessionReducer(initialState, action)).toEqual(expectedState);
});