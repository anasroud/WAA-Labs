import { useState } from "react";
import { IPost } from "../Post/Post";
import style from "./UpdateData.module.scss";


interface IUpdatePost {
  title: string;
  posts: IPost[];
  postsStateChange: (posts: IPost[]) => void;
}
/**
 * adds a dropdown that has the will allow the user to select which post to edit
 * and a text box to edit the title of the post
 * and a submit button to submit the changes
 */
const UpdateData = ({
  posts,
  postsStateChange,
  title
}: IUpdatePost) => {
  const [selectedPost, setSelectedPost] = useState<IPost | null>(null);
  const [newTitle, setNewTitle] = useState<string>("");
  const [error, setError] = useState<string | null>(null);

  const handlePostChange = (e: React.ChangeEvent<HTMLSelectElement>) => {
    const post = posts.find((post) => post.id === parseInt(e.target.value));
    setSelectedPost(post || null);
  };

  const handleTitleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setNewTitle(e.target.value);
  };

  const handleSubmit = () => {
    if (!selectedPost) {
      setError("Please select a post");
      return;
    }
    if (!newTitle) {
      setError("Please enter a title");
      return;
    }
    const updatedPosts = posts.map((post) => {
      if (post.id === selectedPost.id) {
        return {
          ...post,
          title: newTitle
        };
      }
      return post;
    });
    postsStateChange(updatedPosts);
    setSelectedPost(null);
    setNewTitle("");
    setError(null);
  };

  /**
   * components here could be better and split up but since this is a uni project
   * I will leave it as is since it's not as complex but could be better
   */
  return (
    <div className={style.updateData}>
      <h2 className={style.title}>{title}</h2>
      <select className={style.titleDropdown} onChange={handlePostChange}>
        <option value="">Select a post</option>
        {posts.map((post) => (
          <option key={post.id} value={post.id}>
            {post.title}
          </option>
        ))}
      </select>
      <input
        type="text"
        className={style.titleInput}
        value={newTitle}
        onChange={handleTitleChange}
        placeholder="Enter new title"
      />
      <button className={style.submitButton} onClick={handleSubmit}>Submit</button>
      {error && <p>{error}</p>}
    </div>
  );
};

export default UpdateData;
