# Testing Fedora 24 Changes

In this lesson we will be creating test plans and test cases for changes in the
upcoming Fedora 24 release. You need to prepare necessary user accounts and your
systems before the lesson starts.

## Prerequisites

* Create a https://bugzilla.redhat.com account;
* Create a Fedora account. Please complete the onboarding process in advance
because it takes time. Start at https://fedoraproject.org/wiki/Join
 * create a Fedora Account System (FAS) account
 * in FAS sign the Fedora Contributors Licence Agreement,
for instructions click at:
https://fedoraproject.org/wiki/Account_System/CompleteFPCA?rd=Account_System/CompleteCLA

* Create a Fedora wiki page for your profile. For example
https://fedoraproject.org/wiki/User:Atodorov
This will verify you can edit the wiki. (Compelting the FCLA should
give you write access to the wiki).

* Be familiar with IRC. There is a web chat client at
https://webchat.freenode.net/.


* Prepare a Fedora 23 system which can be upgraded to the development Rawhide
version or better install one of the Rawhide snapshots in a VM.
 * Search for an installable daily snapshot under
    http://koji.fedoraproject.org/mash/
 * For example (look for a boot.iso):
http://koji.fedoraproject.org/mash/rawhide-2016mmyy/rawhide/x86_64/os/images/
 * Boot VM from boot.iso and add parameter repo=http://koji..../x86_64/os
 * Use defaults when installing (use at least 20 GB disk)


## Fedora 24 Changes testing

The complete list of proposed changes is lcoated at
* https://fedoraproject.org/wiki/Releases/24/ChangeSet
* https://fedoraproject.org/wiki/Releases/25/ChangeSet

Note: at the time of writing Rawhide is already Fedora 25 with different
changes but we could still test in Fedora 24 features are well implemented.


Quickly read through the list.

### Exercise: (60 minutes)

* Briefly read through the proposed changes
* Instructor will explain some of them and help you choose

* Divide into groups - size depends on the complexity of
chosen feature

* Study the feature page and install required software
on your systems
* Explore the software so you can get familiar with it


### Exercise: (60 minutes)

* Create test plans for your feature
* Focus more on the test cases, rather than complete IEEE test plan
* Document your test plans on the wiki
* Continue making yourself familiar with the software under test
* Ask Instructor for help
* Help from developers may be available on #fedora-qa on IRC

### Exercise: (120 minutes)

* Execute test cases from your test plan
* Report test results in the wiki page
* Report any bugs in Bugzilla and link them in the wiki

### Homework

Complete your test plans/test cases and any file bugs you have found!
