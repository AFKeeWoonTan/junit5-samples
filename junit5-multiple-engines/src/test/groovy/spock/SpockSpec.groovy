/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package spock

import spock.lang.Specification

class SpockSpec extends Specification {
  def "assert that the sum of two numbers equals an expected result"() {
    expect:
    a + b == result

    where:
    a | b | result
    1 | 2 | 3
  }
}
