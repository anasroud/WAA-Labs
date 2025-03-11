import style from "./Post.module.scss";

export interface IPost {
  title: string;
  author: string;
  id: number;
}

const Post = ({
  id,
  title,
  author
}: IPost) => {
  return (
    <div className={style.post}>
      <p>Id: {id}</p>
      <p>Title: {title}</p>
      <p>author: {author}</p>
    </div>
  )
};

export default Post;