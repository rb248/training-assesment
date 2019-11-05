export class Author {
  authorName;
  authorId;
  authorGender;
  maritalStatus;

  authors: any[];


  constructor() {

    this.authors = [
      { authorId: 1, authorName: 'raj', authorGender: 'male', maritalStatus: 'married' },
      { authorId: 2, authorName: 'rajeev', authorGender: 'male', maritalStatus: 'single' },
      { authorId: 3, authorName: 'rajeshwari', authorGender: 'female', maritalStatus: 'married' },
      { authorId: 4, authorName: 'rajni', authorGender: 'female', maritalStatus: 'single' }
    ]

  }

  getAuthors() {
    return this.authors;
  }
}
