[![New Relic Experimental header](https://github.com/newrelic/opensource-website/raw/master/src/images/categories/Experimental.png)](https://opensource.newrelic.com/oss-category/#new-relic-experimental)

# New Relic Java Custom Instrumentation for reporting handled exceptions

Instrumentation for reporting handled exceptions in specific classes

## Installation

1. Obtain the latest release from this repository.
1. Extract the release into a local directory.
1. Transfer the extension JAR file to the target server
1. Copy the extension JAR file into the agent's `extensions` directory (relative to the directory containing the `newrelic.jar` file).
    *Note:* Create the `extensions` directory if it does not exist.
1. Restart your JVM
1. After the app has reloaded, generate traffic against your app that will trigger transactions and exceptions that you expect to see.
1. To debug issues, set `log_level` to `finer` in `newrelic.yml`.

## Usage

Once installed, this extension will perform the following functions:

### Report Handled Exceptions

Exceptions that are thrown out of specific classes are reported even if they are handled later.

## Support

New Relic has open-sourced this project. This project is provided AS-IS WITHOUT WARRANTY OR DEDICATED SUPPORT. Issues and contributions should be reported to the project here on GitHub. We encourage you to bring your experiences and questions to the [Explorers Hub](https://discuss.newrelic.com) where our community members collaborate on solutions and new ideas.

## Contributing

We encourage your contributions to improve newrelic-java-guidewire! Keep in mind when you submit your pull request, you'll need to sign the CLA via the click-through using CLA-Assistant. You only have to sign the CLA one time per project.

If you have any questions, or to execute our corporate CLA, required if your contribution is on behalf of a company,  please drop us an email at opensource@newrelic.com.

**A note about vulnerabilities**

As noted in our [security policy](../../security/policy), New Relic is committed to the privacy and security of our customers and their data. We believe that providing coordinated disclosure by security researchers and engaging with the security community are important means to achieve our security goals.

If you believe you have found a security vulnerability in this project or any of New Relic's products or websites, we welcome and greatly appreciate you reporting it to New Relic through [HackerOne](https://hackerone.com/newrelic).

## License
newrelic-java-exceptionhandler is licensed under the [Apache 2.0](http://apache.org/licenses/LICENSE-2.0.txt) License.
>[If applicable: The newrelic-java-guidewire also uses source code from third-party libraries. You can find full details on which libraries are used and the terms under which they are licensed in the third-party notices document.]
