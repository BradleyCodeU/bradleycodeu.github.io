# CONTRIBUTION GUIDE

If you are new to open-source contribution and don't know how to get started, don't worry, this is a deatiled step by step guide to help you make your first contribution.

Before heading any further, open terminal and run `git --version` to make sure that git is installed on your machine, if not, install it from [here](https://git-scm.com/downloads) according to your operating system.

## Fork this repository

In order to make any changes to this repository, fork it by clicking on the [fork button](https://github.com/BradleyCodeU/bradleycodeu.github.io/fork). This will create a copy of this repository in your account.

## Clone the repository

Now, to clone this repository to your local machine, copy the url of the forked repository.

Now, open a terminal and run the following command:

```bash
git clone <copied- url>
```

Here, replace `<copied-url>` with the url of the forked repository you just copied.

For example,

```bash
git clone https://github.com/your-user-name/bradleycodeu.github.io.git
```

Remember, you have to clone the *forked* repo from your profile, not the original one.

## Create a branch

After cloning the repository, change the current working directory to the repository directory by running the following command:

```bash
cd bradleycodeu.github.io
```

Before making any changes, make sure to always create a new branch. To create a new brach run the following command:

```bash
git checkout -b branch-name
```

You can run `git branch` command to check your branch status.

## Make changes

Now you are all set to make changes. For that you can use any text editor, but I will recommend using VS Code as it feature rich and easy to use. If VS Code is already installed on your machine, run the following command:

```bash
code .
```

It will open all the files of the current directory in VS Code.

After making the changes, run `git status` command. It will show you all the changes you have made.

## Commit those changes

Now, before commiting the changes you will have to stage those changes to the branch you created. For that run the following command:

```bash
git add .
````

Now commit those changes by running the following command:

```bash
git commit -m "put-your-message-here"
```

Put a short commit message describing what you did.

## Push to GitHub

Finally push the changes you made to github by running the following command:

```bash
git push origin -u <your-branch-name>
```

Replace `<your-branch-name>` with the name of the branch you created earlier.

## Submit the pull request

Now open [Github](https://github.com) in your browser, here you will see a notification. Click on **Compare & Pull Request**.

Now submit the pull request.

Soon your pull request will be reviewed and merged by the maintainers if there is no conflict. You will be notified via email once your pull request has been merged.

**Happy Contributing!**
