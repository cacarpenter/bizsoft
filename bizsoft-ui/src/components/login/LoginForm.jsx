import React from 'react';


class LoginForm extends React.Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <div>
                    <label for="useremail">Email:
                        <input type="email" id="useremail" name="useremail" required autoComplete="email"/>
                    </label>
                </div>
                <div>
                    <label for="userx">Password:
                        <input type="password" id="userx" name="userx" required/>
                    </label>
                </div>
                <input type="submit" value="Submit"/>
            </form>
        );
    }
}

export default LoginForm;