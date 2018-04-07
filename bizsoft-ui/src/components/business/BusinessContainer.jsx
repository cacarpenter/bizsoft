import React from 'react';

const Business = (props) => {
    return (
        <div>
            <img src={props.biz_logo_url}/>
            <div style={{display: 'inline-block', marginLeft: 10}}>
                <div style={{fontSize: '1.25em', fontWeight: 'bold'}}>{props.name}</div>
                <div><a href={props.biz_url}>{props.biz_url}</a></div>
            </div>
        </div>
    );
};

class BusinessContainer extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <Business name="Bob's Burgers" biz_logo_url="http://placehold.it/75" biz_url="http://www.google.com"/>
            </div>
        );
    }
}

export default BusinessContainer;