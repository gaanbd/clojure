# clojure-lab

A lab for clojure training (using leiningen/ring)

## Setting up your machine to run Clojure
### Installation on Mac
Install the command line tools with brew: `$ brew install clojure`

If you’ve already installed, you can upgrade to the latest release with: `$ brew upgrade clojure`

### Installation on Linux
Ensure that the following dependencies are installed: `bash`, `curl`, `rlwrap`, and `Java`.

Use the linux-install script to download and run the install, which will create `/usr/local/bin/clj`, `/usr/local/bin/clojure`, and `/usr/local/lib/clojure`.

Do the following:

> `$ curl -O https://download.clojure.org/install/linux-install-1.10.0.414.sh`

> `$ chmod +x linux-install-1.10.0.414.sh`

> `$ sudo ./linux-install-1.10.0.414.sh`

### Installing Leiningen

Homebrew again comes to the rescue and can install it for you: `$ brew install leiningen`

> See the Packaging page of Leiningen's wiki for other options:
> https://github.com/technomancy/leiningen/wiki/Packaging
> On the other hand, a manual install of Leiningen is very easy too.

Once installed, Leiningen solves many important problems for you, mostly dealing with Java's CLASSPATH, project setup, dependencies, and building.

The further instructions below assume you have IntelliJ installed and the Cursive add-on

For a quick reference cheat sheet for Cursive, you can click Help->Show Cursive Cheat Sheet. 

## Create run configs for Cursive REPL

1.  Run -> Edit Configuration...
2.  Click '+' at top left and choose Clojure REPL -> Local
3.  Give the configuration a name (e.g. 'Lab') and choose OK

After creating the run configuration, select it in the 'Select Run/Debug Configuration' dropdown in the top right.  You can start the REPL in Run or Debug mode.

Alternatively, the ring configuration for this project provides an nrepl that you can attach to remotely.

1.  Run -> Edit Configuration...
2.  Click '+' at top left and choose Clojure REPL -> Remote
3.  Give the configuration a name (e.g. 'Ring REPL') and make sure 'Connect to server' is selected
4.  Use host "localhost"
5.  Use port 10102
6.  Choose Context Module as "clojure-lab"
7.  Hit OK

Now you can run the ring server using: lein run-local (an alias setup for this project)
Then you can select the 'Ring REPL' run configuration and run to attach

## Going through the labs

We suggest running through the basic labs first contained in `src/clojure_lab/repl_labs`.  
To run these labs, open the corresponding file in IntelliJ and follow the instructions in the comments.

The last lab can be found in the `src/clojure_lab/handler.clj` file.  Follow instructions in the comments.