import api from './Api';

export const login = (credentials) => {
    api.post('/login', credentials)
        .then((response) => {
            console.log("login callback");
            console.log(response);
        })
};