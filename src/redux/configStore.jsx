import {applyMiddleware, combineReducers, legacy_createStore} from "redux";
import {thunk} from "redux-thunk";
import postReducer from "./reducers/postReducer";

const rootReducer = combineReducers({
    postReducer
})
const store = legacy_createStore(rootReducer, applyMiddleware(thunk));


export default store;