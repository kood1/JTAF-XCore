/*
 * (C) Copyright 2014 Java Test Automation Framework Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.finra.jtaf.core.plugins.parsing;

/***
 * Interface for Parser Plugins which get executed after each applicable test is parsed
 */
public interface IPostParseTestPlugin {

	/***
	 * This method executes after each test is parsed which has the tag name returned by getTagName()
	 * 
	 * @param ctx
	 * @throws ParserPluginException
	 */
	public void execute(PostTestParserPluginContext ctx) throws ParserPluginException;
	
	/***
	 * This will return the tag name the ScriptParser will be looking for in the test body. If not found,
	 * the execute method will not be run.
	 */
	public String getTagName();
}
