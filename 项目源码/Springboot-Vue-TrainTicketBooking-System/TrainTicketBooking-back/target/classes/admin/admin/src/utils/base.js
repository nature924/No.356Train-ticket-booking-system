const base = {
    get() {
        return {
            url : "http://localhost:8080/huochpiaodingpiao/",
            name: "huochpiaodingpiao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/huochpiaodingpiao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "火车票订票系统"
        } 
    }
}
export default base
