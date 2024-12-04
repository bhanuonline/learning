**Git Command :**

    * If HTTPS is failing : git remote set-url origin git@github.com:username/repo.git
    * Delete the branch localy :git branch -d bls_day_2  
    * Force delete the branch if it's not merged: git branch -D bls_day_2  
    * Delete the same branch from remote: git push origin --delete <branch_name> [git push origin --delete feature/test]

**What is Git Rebase?**

Git rebase moves your branch to the tip of another branch and reapplies your commits on top of it

**Why Use Rebase?**

Update your branch with the latest changes from the main branch (e.g., master or main).
Keep a clean and straight history without merge commits

**How to Use Git Rebase**

    Imagine this history:

    main:    A---B---C
    feature:          D---E

    git checkout feature :Switch to your branch
    git rebase master :Rebase onto main
    
    This will move feature to start after C:
    main:    A---B---C
    feature:           D'---E'

    Durring rebase 
    git rebase --continue [Git will stop and show the conflict. fix the conflict]
    git rebase --abort : If you want to stop the rebase completely, run:

    Rebase Example in Plain Language

    Before Rebase: Your branch is based on older code.

    Your changes (D and E) are "behind" the main branch.
    Rebase: It picks up your changes and replays them on top of the latest code (C).
    
    Result: Your branch is now updated with the latest changes, as if you started coding after them.

**Why Avoid Rebasing Shared Branches?**

    When you rebase a branch, Git rewrites its commit history. This means:
    
    The commits get new IDs.
    The history of the branch is different from before.
    If someone else is working on the same branch and you rebase it, their copy of the branch will no longer match yours. This creates conflicts and makes collaboration difficult.
    
    Example of the Problem
    Original State:
    
    You and your teammate are working on a shared branch called feature:
    
    A---B---C (feature)
    You Rebase Locally:
    
    You rebase the branch onto main, and Git rewrites the history:
    
    main:    X---Y---Z
    feature:           A'---B'---C'
    Note that A, B, C have now become A', B', C'.
    Teammate's Copy:
    
    Your teammate still has the old commits:
    
    A---B---C (feature)
    Conflict:
    
    If your teammate tries to push or pull changes, Git sees a mismatch between your rebased branch (A'---B'---C') and their branch (A---B---C).
    This causes merge conflicts or forces them to fix their local branch manually.

**What to Do Instead?**

    If the branch is shared, use merge instead of rebase:
    
    git merge <branch_name>
    This keeps everyone’s commit history intact and avoids rewriting commits.


**Workflow Differences**

    Aspect	                            Git Rebase	                                Git Merge
    Commit History	                    Linear, looks cleaner	                    Branched, shows full history
    Conflicts	                        Resolved during the rebase	                 Resolved during the merge
    Merge Commit	                    No merge commit created	                    Merge commit created
    Use Case	                        When you want clean history	                When you want to preserve history
    Rewrites History?	                Yes, rewrites commit history	            No, preserves commit history

    EX :
    main:    A---B---C
    feature:          D---E
    git rebase main
    main:    A---B---C
    feature:           D'---E'
    
    git merge main
    main:    A---B---C-------M
    feature:          \----D---E




        
            
