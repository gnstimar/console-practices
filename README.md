# Task 1: The Basics
## 1. Initialize a New Repository
- "git init"
- make some changes (print text Hello World)
- "git add .": staging the changes
- "git commit -m "Create text Hello World" ": create the first commit

## 2. Connect to Github
- Create a new repository on GitHub
- Link the local repository to GitHub:
  - "git remote add origin https://github.com/gnstimar/console-practices.git"
  - "git branch -M main"
  - "git push -u origin main": this pushes the commit to GitHub

## 3. Track Changes
- Create new files: ReadInFromTheConsole, Printer
- Modify existing file: Calculator: text is modified
- Create few more files: NewFile, .env file with some environment variables

## 4. Ignore Files
- Create `.gitignore` file
- Configure to exclude unnecessary or sensitive files.
- Add `**/.env` to the `.gitignore` file to safely exclude environment variables from any subdirectory.
- If a file is already tracked by Git, run `git rm --cached <file-path>` to stop tracking it without deleting it locally.

# Task 3: Advanced Challenges
- Branch and merging:
  - "git branch first_branch": create a new branch
  - "git checkout first_branch": go to the new branch
  - Make changes, commit them and merge it back into the main branch
    - "git push -u origin first_branch" : creates a new remote branch and pushes the commit there



# console-practices
Couple of simple console exercises to practise VSC, GIT and JAVA
