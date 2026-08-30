# LeetCode Hot 100（Java）

基于力扣官方 [LeetCode 热题 100](https://leetcode.cn/studyplan/top-100-liked/) 的 Java 17 刷题项目。

## 环境

- JDK 17+
- Maven 3.9+
- JUnit 5

当前机器尚未在 `PATH` 中检测到 Java 和 Maven；安装后运行：

```bash
mvn test
```

## 目录约定

```text
src/main/java/com/leetcode/hot100/
  common/       公共数据结构（ListNode、TreeNode）
  day01...20/   每日题解
src/test/java/  单元测试
docs/           20 天计划和复盘记录
```

类名采用 `P题号英文名`，例如 `P0001TwoSum`。每道题至少记录复杂度，并补充正常、边界和异常规模用例。

## 建议节奏

每天 5 题：先独立思考 20–30 分钟，再看提示；当天完成测试，次日先盲写前一天最难的一题。详见 [20 天计划](docs/20-day-plan.md)。

> 根目录原有的 `untitled/` 是历史工程，初始化时予以保留，但通过 `.gitignore` 排除其 IDE 元数据。

