import React from 'react';
import PropTypes from 'prop-types'

const LoginForm = (props) => (
    <form onSubmit={(event) => {
        event.preventDefault();
        props.onFormSubmit();
    }}>
        <div>
            <input type="email" id="useremail" name="useremail" required autoComplete="email" placeholder="Email"/>
        </div>
        <div>
            <input type="password" id="userx" name="userx" required placeholder="Password"/>
        </div>
        <input type="submit" value="Submit"/>
    </form>
)

LoginForm.propTypes = {
    onFormSubmit: PropTypes.func.isRequired
}


export default LoginForm;