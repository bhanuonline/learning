# MySQL path
#export PATH="/usr/local/mysql/bin:$PATH"

# Maven setup
#export M2_HOME="/Users/bhanupratap/apache-maven-3.9.9"
#PATH="${M2_HOME}/bin:${PATH}"

# Java setup (ensure the right version is prioritized)
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/openlogic-openjdk-17.jdk/Contents/Home
#export PATH=$JAVA_HOME/bin:$PATH  # Add Java 17 to PATH first

# JMC path (only needed if not already covered by the Java path)
#export PATH=$PATH:/Library/Java/JavaVirtualMachines/openlogic-openjdk-17.jdk/Contents/Home/bin
#export PATH="$JAVA_HOME/bin:$PATH"
#export PATH  # Make sure the final PATH is updated

#alias jmc="open /Library/Java/JavaVirtualMachines/openlogic-openjdk-17.jdk/Contents/Home/bin/jmc.app"


#alias setjava11='export JAVA_HOME=$(/usr/libexec/java_home -v 11)'
#alias setjava17='export JAVA_HOME=$(/usr/libexec/java_home -v 17)'
#alias setjava8='export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)'



# MySQL path
export PATH="/usr/local/mysql/bin:$PATH"

# Maven setup
export M2_HOME="/Users/bhanupratap/apache-maven-3.9.9"
export PATH="${M2_HOME}/bin:$PATH"

# Java setup (default to Java 11)
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
export PATH="$JAVA_HOME/bin:$PATH"

# Java setup (default to Java 8)
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
export PATH="$JAVA_HOME/bin:$PATH"

# Alias for switching Java versions
alias setjava11='export JAVA_HOME=$(/usr/libexec/java_home -v 11); export PATH=$JAVA_HOME/bin:$PATH'
alias setjava17='export JAVA_HOME=$(/usr/libexec/java_home -v 17); export PATH=$JAVA_HOME/bin:$PATH'
alias setjava8='export JAVA_HOME=$(/usr/libexec/java_home -v 1.8); export PATH=$JAVA_HOME/bin:$PATH'
# JMC (Java Mission Control) shortcut
alias jmc="open /Library/Java/JavaVirtualMachines/openlogic-openjdk-17.jdk/Contents/Home/bin/jmc.app"

# Ensure the PATH variable is correctly set
export PATH
