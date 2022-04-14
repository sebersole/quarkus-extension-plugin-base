package io.github.sebersole.quarkus.extension;

import org.junit.jupiter.api.Test;

/**
 * @author Steve Ebersole
 */
public class MyExtensionTest {
	@Test
	public void testIt() {
		// just make sure we can reference stuff from both the runtime and deployment artifacts
		MyExtensionConfig config;
		MyExtensionProcessor processor;
	}
}
