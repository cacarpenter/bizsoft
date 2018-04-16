import { watchFetchSessionRequest } from "./session-sagas";
import { all } from 'redux-saga/effects';

export default function* rootSaga() {
    yield all([
        watchFetchSessionRequest()
    ])
}