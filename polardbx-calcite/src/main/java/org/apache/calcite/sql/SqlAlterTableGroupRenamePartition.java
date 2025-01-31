/*
 * Copyright [2013-2021], Alibaba Group Holding Limited
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

package org.apache.calcite.sql;

import com.alibaba.polardbx.common.utils.Pair;
import org.apache.calcite.sql.parser.SqlParserPos;

import java.util.List;

/**
 * Created by luoyanxin.
 *
 * @author luoyanxin
 */
public class SqlAlterTableGroupRenamePartition extends SqlAlterTableRenamePartition {
    private SqlAlterTableGroup parent;

    public SqlAlterTableGroupRenamePartition(SqlParserPos pos, List<Pair<String, String>> changePartitionsPair) {
        super(pos, changePartitionsPair);
    }

    public void setParent(SqlAlterTableGroup parent) {
        this.parent = parent;
    }

    public SqlAlterTableGroup getParent() {
        return parent;
    }
}
