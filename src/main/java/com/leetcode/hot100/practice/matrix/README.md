# 矩阵基础操作练习

建议按以下顺序完成：

1. `MatrixTraversalPractice`：按行、按列遍历矩阵。
2. `MatrixDirectionPractice`：使用方向数组获取合法的上下左右邻居。
3. `MatrixBoundaryPractice`：顺时针遍历矩阵最外层边界。
4. `MatrixTransformPractice`：矩阵转置与水平翻转。

每个类在测试目录中都有对应的禁用测试。完成一个类后，删除该测试类上的
`@Disabled`，再运行对应单元测试。

练习时重点关注：

- `matrix.length` 是行数，`matrix[0].length` 是列数。
- 每次移动坐标前先验证行列边界。
- 原地修改矩阵时，注意不要覆盖尚未读取的数据。
- 空矩阵、单行、单列和非正方形矩阵都是重要边界情况。
