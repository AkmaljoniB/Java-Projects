package Kotlin

fun isPalindrome(s: String):Boolean{
    var l=0
    var r=s.length-1
    while(l<r){
        if(!s[l].isLetterOrDigit())l++
        else if(!s[r].isLetterOrDigit())r--
        else {
            if(s[l].lowercaseChar()!=s[r].lowercaseChar())return false
            l++
            r--
        }
    }
    return true
}