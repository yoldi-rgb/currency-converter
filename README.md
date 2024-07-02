!
    <h1>Currency Converter</h1>
    <p>A simple console-based currency converter application written in Java that allows users to convert between different currencies using up-to-date exchange rates.</p>
    <h2>Table of Contents</h2>
    <ul>
        <li><a href="#introduction">Introduction</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#usage">Usage</a></li>
        <li><a href="#contributing">Contributing</a></li>
        <li><a href="#authors">Authors</a></li>
        <li><a href="#technologies-used">Technologies Used</a></li>
    </ul>
    <h2 id="introduction">Introduction</h2>
    <p>The Currency Converter is a lightweight and easy-to-use console application designed to help users quickly and accurately convert between different currencies. This project utilizes real-time exchange rate data to ensure conversions are always up-to-date.</p>
    <h2 id="features">Features</h2>
    <ul>
        <li>Real-time exchange rate updates</li>
        <li>Supports multiple currencies</li>
        <li>Accurate and reliable conversions</li>
    </ul>
    <h2 id="installation">Installation</h2>
    <p>To get a local copy up and running follow these simple steps:</p>
    <h3>Prerequisites</h3>
    <p>Make sure you have the following software installed:</p>
    <ul>
        <li><a href="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html">Java JDK</a></li>
        <li><a href="https://maven.apache.org/download.cgi">Maven</a> (for dependency management)</li>
    </ul>
    <h3>Clone the Repository</h3>
    <pre><code>git clone https://github.com/yoldi-rgb/currency-converter.git
cd currency-converter</code></pre>
    <h3>Install Dependencies</h3>
    <p>This project uses Gson for JSON handling. Add the following dependency to your <code>pom.xml</code> file:</p>
    <pre><code>&lt;dependency&gt;
    &lt;groupId&gt;com.google.code.gson&lt;/groupId&gt;
    &lt;artifactId&gt;gson&lt;/artifactId&gt;
    &lt;version&gt;2.8.9&lt;/version&gt;
&lt;/dependency&gt;</code></pre>
    <p>Then, run the following command to install the dependencies:</p>
    <pre><code>mvn install</code></pre>
    <h3>Compile the Program</h3>
    <pre><code>mvn compile</code></pre>
    <h2 id="usage">Usage</h2>
    <p>To run the application, execute:</p>
    <pre><code>mvn exec:java -Dexec.mainClass="com.yourpackage.CurrencyConverter"</code></pre>
    <p>Replace <code>com.yourpackage</code> with the actual package name of your main class.</p>
    <p>Follow the on-screen instructions to convert currencies.</p>
    <h2 id="contributing">Contributing</h2>
    <p>We welcome contributions to the Currency Converter project! Here's how you can help:</p>
    <h3>Reporting Bugs</h3>
    <ol>
        <li>Ensure the bug was not already reported by searching on GitHub under <a href="https://github.com/yoldi-rgb/currency-converter/issues">Issues</a>.</li>
        <li>If you're unable to find an open issue addressing the problem, <a href="https://github.com/yoldi-rgb/currency-converter/issues/new">open a new one</a>. Be sure to include a title and clear description, as much relevant information as possible, and a code sample or an executable test case demonstrating the expected behavior that is not occurring.</li>
    </ol>
    <h3>Suggesting Enhancements</h3>
    <ol>
        <li>Open a new issue with the tag "enhancement".</li>
        <li>Clearly describe your suggestion and provide examples if possible.</li>
    </ol>
    <h3>Pull Requests</h3>
    <ol>
        <li>Fork the Project</li>
        <li>Create your Feature Branch (<code>git checkout -b feature/feature</code>)</li>
        <li>Commit your Changes (<code>git commit -m 'Add some feature'</code>)</li>
        <li>Push to the Branch (<code>git push origin feature/feature</code>)</li>
        <li>Open a Pull Request</li>
    </ol>
    <p>Please make sure to update tests as appropriate and adhere to the project's coding standards.</p>
    <h2 id="authors">Authors</h2>
    <ul>
        <li>Yoldi RGB</li>
    </ul>
    <h2 id="technologies-used">Technologies Used</h2>
    <ul>
        <li>Java</li>
        <li>Gson (for JSON handling)</li>
    </ul>
</body>
</html>


