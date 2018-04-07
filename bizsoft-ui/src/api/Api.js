import axios from 'axios';

export default axios.create({
    baseURL: '/api/v1',
    timeout: 1000,
//    headers: {'Authentication': 'bizsoft.login'}
});
