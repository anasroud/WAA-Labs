import { useEffect, useState } from "react";
import Post from "../Post/Post";
import UpdateData from "../UpdateData/UpdateData";
import style from "./Dashboard.module.scss";

const defaultPosts = [
  {
    id: 1,
    title: "Happiness",
    author: "John",
  },
  {
    id: 2,
    title: "MIU",
    author: "Dean",
  },
  {
    id: 3,
    title: "Enjoy Life",
    author: "jasmine",
  },
];
const Dashboard = () => {
  const [posts, setPosts] = useState(defaultPosts);

  return (
    <div className={style.dashboardContainer}>
      <div className={style.postsContainer}>
        {posts.map((post) => (
          <Post
            key={post.id}
            id={post.id}
            title={post.title}
            author={post.author}
          />
        ))}
      </div>

      <UpdateData
        posts={posts}
        postsStateChange={setPosts}
        title="Update Post"
      />
    </div>
  );
};

export default Dashboard;
