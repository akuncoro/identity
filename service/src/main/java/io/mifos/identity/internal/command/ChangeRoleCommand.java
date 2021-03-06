/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.identity.internal.command;

import io.mifos.identity.api.v1.domain.Role;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings("unused")
public class ChangeRoleCommand {
  private String identifier;
  private Role instance;

  public ChangeRoleCommand()
  {
  }

  public ChangeRoleCommand(final String identifier, final Role instance) {
    this.identifier = identifier;
    this.instance = instance;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Role getInstance() {
    return instance;
  }

  public void setInstance(Role instance) {
    this.instance = instance;
  }
}
