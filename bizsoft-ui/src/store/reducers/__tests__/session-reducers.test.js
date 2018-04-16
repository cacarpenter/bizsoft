import sessionReducer from '../session-reducers';
import {sessionRequest, sessionSuccess, sessionFailed} from '../../actions/creators/session-action-creators'
import deepFreeze from 'deep-freeze';

test("Fetch Session sets isFetching to true and clears other fields", () => {
    const initialState = {
        session: null,
        isLoggedIn: false,
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
        isLoggedIn: false,
        isFetching: true,
        errorMessage: null
    }
    expect(sessionReducer(initialState, action)).toEqual(expectedState);
});

test("Fetch Session Success sets isFetching to false and sets session", () => {
    const initialState = {
        session: null,
        isLoggedIn: false,
        isFetching: true,
        errorMessage: null
    }
    deepFreeze(initialState);
    // no password in response
    const action = sessionSuccess({
        email: 'test.example@email.com'
    });
    const expectedState = {
        session: {email: 'test.example@email.com'},
        isLoggedIn: true,
        isFetching: false,
        errorMessage: null
    }
    expect(sessionReducer(initialState, action)).toEqual(expectedState);
});

test("Fetch Session Failure sets isFetching to false and sets errorMessage", () => {
    const initialState = {
        session: null,
        isLoggedIn: false,
        isFetching: true,
        errorMessage: null
    }
    deepFreeze(initialState);
    const action = sessionFailed('Something Bad Happened');
    const expectedState = {
        session: null,
        isLoggedIn: false,
        isFetching: false,
        errorMessage: 'Something Bad Happened'
    }
    expect(sessionReducer(initialState, action)).toEqual(expectedState);
});