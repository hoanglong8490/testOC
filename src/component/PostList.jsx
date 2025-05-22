import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { fetchPosts } from "../redux/actions/fetchPost";

const PostList = () => {
    const dispatch = useDispatch();
    const { posts, loading, error } = useSelector(state => state.postReducer);
    console.log(posts);
    useEffect(() => {
        dispatch(fetchPosts());
    }, [dispatch]);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error}</p>;

    return (
        <div>
            <h2>Post List</h2>
            <ul>
                {posts.map(post => (
                    <li key={post.id}><strong>{post.title}</strong></li>
                ))}
            </ul>
        </div>
    );
};

export default PostList;
