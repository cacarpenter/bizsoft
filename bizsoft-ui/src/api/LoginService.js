import api from './Api';

export const login = (credentials) => {
    return api.post('/login', credentials)
        .then(response => {
            return {
                success: true,
                data: response.data.sessionId,
                errorMessage: null
            }
        })
        .catch((err) => {
            console.error(err);
            const errMsg = err.response ? err.response.message : err.message;
            return {
                success: false,
                errorMessage: errMsg,
                data: null
            }
        })
};