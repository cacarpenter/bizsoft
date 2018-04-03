import React from 'react';

const Business = (props) => {
    return (
        <div>
            <img src={props.biz_logo_url} />
            <div style={{display: 'inline-block', marginLeft: 10}}>
                <div style={{fontSize: '1.25em', fontWeight: 'bold'}}>{props.name}</div>
                <div><a href={props.biz_url}>{props.biz_url}</a></div>
            </div>
        </div>
    );
};

export default Business;