import React from 'react';


class LoginForm extends React.Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();
        this.props.onFormSubmit();
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <div>
                    <input type="email" id="useremail" name="useremail" required autoComplete="email" placeholder="Email"/>
                </div>
                <div>
                    <input type="password" id="userx" name="userx" required placeholder="Password"/>
                </div>
                <input type="submit" value="Submit"/>
            </form>
        );
    }
}

export default LoginForm;